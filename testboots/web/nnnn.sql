
���ȷο� ���
INSERT INTO FOLLOW VALUES(FOLLOW_ID.NEXTVAL, 'id01', 'id02');
���ȷο� ����Ʈ
SELECT * FROM CONTENTS WHERE USER_ID='ID01' and 
���ȷο� ����
//�ȷο���̵� 1�� �� ����.
DELETE FROM FOLLOW WHERE FOLLOW_ID=1
���ȷο� �˻�
//�ȷο� ���̵� 2�ΰ�� �˻�


�����ã�� ���
// ���������̵� 3�̰� USER_ID�� ID01�� ���� ���
INSERT INTO FAVORITE VALUES(FAVORITE_ID.NEXTVAL, 3, 'ID01');
�����ã�� ����
//���ã�� ID�� 1�� �׸��� �����϶�.
DELETE FROM FAVORITE WHERE FAVORITE_ID=1
�����ã�� ����Ʈ
//�������̵� ID01�� ����� ��� ���ã�� ����Ʈ�� ����Ͽ���.
SELECT * FROM FAVORITE WHERE USER_ID='ID01'


���ɻ� ��ƺ���
SELECT * FROM CONTENTS WHERE CATEGORY_ID='TRAVEL'
