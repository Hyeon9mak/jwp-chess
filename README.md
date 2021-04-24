# java-chess
체스 게임 구현을 위한 저장소

## 추가미션 기능 구현 목록
- 유저 분리 (default 유저가 흑/백 모두 삽입되고 있음)
    - 플레이어 1과 플레이어2의 비밀번호를 각각 입력 받도록
- 게임 진행 상태 '준비중' 추가 (진행중/종료됨 2가지 밖에 없음)
- 방 생성시 대기목록이 아닌 게임 방으로 입장하도록
- 방에 입장할 때 비밀번호를 입력하도록
- 모든 move 명령마다 비밀번호를 요구해야함
    - 클라이언트 측에 비밀번호 자원을 남겨서(쿠키) 비밀번호 요구에 대응하도록