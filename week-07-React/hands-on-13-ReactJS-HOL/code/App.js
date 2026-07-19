import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  return (
    <div>
      <h1>Blogger App</h1>
      <BookDetails available={true} />
      <BlogDetails published={false} />
      <CourseDetails status="ongoing" />
    </div>
  );
}

export default App;