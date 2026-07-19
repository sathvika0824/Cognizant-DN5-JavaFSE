function BlogDetails(props) {
  return (
    <div>
      <h3>Blog Details</h3>
      {props.published && <p>Blog has been published</p>}
      {!props.published && <p>Blog is still a draft</p>}
    </div>
  );
}

export default BlogDetails;