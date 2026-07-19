function CourseDetails(props) {
  let statusElement;

  if (props.status === 'ongoing') {
    statusElement = <p>Course is currently ongoing</p>;
  } else if (props.status === 'completed') {
    statusElement = <p>Course has been completed</p>;
  } else {
    statusElement = <p>Course has not started yet</p>;
  }

  return (
    <div>
      <h3>Course Details</h3>
      {statusElement}
    </div>
  );
}

export default CourseDetails;