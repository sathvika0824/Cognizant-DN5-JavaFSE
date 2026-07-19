function BookDetails(props) {
  return (
    <div>
      <h3>Book Details</h3>
      {props.available ? <p>Book is available</p> : <p>Book is out of stock</p>}
    </div>
  );
}

export default BookDetails;