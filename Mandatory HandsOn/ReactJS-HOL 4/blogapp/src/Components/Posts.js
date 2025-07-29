
import React, { Component } from 'react';
import Post from './Post';
class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Fetch posts from API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data.slice(0, 10) }); // Load first 10 for simplicity
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        this.setState({ hasError: true });
      });
  }


  componentDidMount() {
    this.loadPosts();
  }

  
  componentDidCatch(error, info) {
    console.error('Caught an error:', error, info);
    alert('Something went wrong while rendering the posts.');
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Oops! Something went wrong.</h2>;
    }

    return (
      <div style={{ padding: '2rem' }}>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
