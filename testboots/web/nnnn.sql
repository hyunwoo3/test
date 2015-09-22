
●팔로우 등록
INSERT INTO FOLLOW VALUES(FOLLOW_ID.NEXTVAL, 'id01', 'id02');
●팔로우 리스트
SELECT * FROM CONTENTS WHERE USER_ID='ID01' and 
●팔로우 삭제
//팔로우아이디가 1인 것 삭제.
DELETE FROM FOLLOW WHERE FOLLOW_ID=1
●팔로우 검색
//팔로우 아이디가 2인경우 검색


●즐겨찾기 등록
// 컨텐츠아이디가 3이고 USER_ID가 ID01인 것을 등록
INSERT INTO FAVORITE VALUES(FAVORITE_ID.NEXTVAL, 3, 'ID01');
●즐겨찾기 삭제
//즐겨찾기 ID가 1인 항목을 삭제하라.
DELETE FROM FAVORITE WHERE FAVORITE_ID=1
●즐겨찾기 리스트
//유저아이디가 ID01인 경우의 모든 즐겨찾기 리스트를 출력하여라.
SELECT * FROM FAVORITE WHERE USER_ID='ID01'


관심사 모아보기
SELECT * FROM CONTENTS WHERE CATEGORY_ID='TRAVEL'
