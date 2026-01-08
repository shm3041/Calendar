import { useState, useEffect } from 'react'
import './App.css'

function App() {
  // 1. 데이터를 담을 그릇 (State)
  const [schedules, setSchedules] = useState([]);

  // 2. 백엔드(Spring Boot)에서 데이터 가져오기
  useEffect(() => {
    // 후배(백엔드)가 만들어줄 주소: /api/schedule
    fetch('http://localhost:8080/api/schedule')
      .then(response => response.json())
      .then(data => {
        console.log("데이터 도착함:", data);
        setSchedules(data); // 가져온 데이터를 그릇에 담기
      })
      .catch(error => console.error("백엔드 연결 실패 (아직 안 켰거나 CORS 문제):", error));
  }, []);

  return (
    <div className="container">
      <h1> 성민 한목 캘린더 (React)</h1>
      <p>Thymeleaf에서 React로 완벽 전환 중!</p>
      
      <div className="card-list">
        {/* 데이터가 없으면 '로딩중...' 표시 */}
        {schedules.length === 0 ? (
          <p>데이터를 불러오는 중입니다... (백엔드를 켜주세요)</p>
        ) : (
          /* 데이터가 있으면 리스트 보여주기 */
          schedules.map((item, index) => (
            <div key={index} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
              <h3>{item.date}</h3>
              <p>{item.title}</p>
            </div>
          ))
        )}
      </div>
    </div>
  )
}

export default App