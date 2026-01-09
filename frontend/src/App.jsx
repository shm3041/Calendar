import Header from './components/Header'; // 1. 불러오기 (잘 하셨습니다!)
import { useState, useEffect } from 'react'
import './App.css'

function App() {
  const [schedules, setSchedules] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/schedule')
      .then(response => response.json())
      .then(data => {
        console.log("데이터 도착함:", data);
        setSchedules(data);
      })
      .catch(error => console.error("백엔드 연결 실패:", error));
  }, []);

  return (
    // 🚨 중요: Header와 내용을 감싸는 '큰 부모 박스(div)'가 새로 필요합니다.
    <div>
      
      {/* 2. 여기에 헤더를 '배치'해야 화면에 나옵니다! */}
      <Header />

      {/* 3. 기존 내용은 아래쪽에 그대로 둡니다 */}
      <div className="container mt-4">
        <h1> 캘린더를 만들어보자 (React)</h1>
        <p>Thymeleaf에서 React로 완벽 전환 중!</p>
        
        <div className="card-list">
          {schedules.length === 0 ? (
            <p>데이터를 불러오는 중입니다... (백엔드를 켜주세요)</p>
          ) : (
            schedules.map((item, index) => (
              <div key={index} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
                <h3>{item.date}</h3>
                <p>{item.title}</p>
              </div>
            ))
          )}
        </div>
      </div>

    </div> 
  )
}

export default App