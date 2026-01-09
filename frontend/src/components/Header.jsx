// src/components/Header.jsx
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

function Header() {
  return (
    <Navbar bg="dark" data-bs-theme="dark">
      <Container>
        <Navbar.Brand href="/"> 캘린더 </Navbar.Brand>
        <Nav className="me-auto">
          <Nav.Link href="/">홈</Nav.Link>
          <Nav.Link href="/login">로그인</Nav.Link>
        </Nav>
      </Container>
    </Navbar>
  );
}

export default Header;