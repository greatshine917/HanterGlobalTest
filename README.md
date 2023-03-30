﻿# Test1
 Board 클래스를 확인하시면 됩니다.  
 category는 기본적으로 Map을, 게시물은 List를 사용했습니다.  
 addPost는 게시물을 올린다고 가정하는 메서드입니다. 제목, 본문, 설정해놓은 카테고리Id를 등록합니다.  
 getPost는 searchPost라는 List에 카테고리Id로 필터링한 게시물만 담아 리턴합니다.  
 getJson은 getPost에서 리턴받은 searchPost를 Json형태로 바꿔줍니다.  
 checkCategory는 게시물에 등록된 카테고리Id와 getPost를 할 때 기준이 되는 카테고리Id를 입력받아 비교하여 boolean값을 리턴합니다.
 registeredCategory는 카테고리를 등록하는 메서드입니다.
 
 
 
 # Test2
 동전의 합이 될 수(sum)와, 배열의 크기가 될 수, 그리고 배열에 포함될 동전들을 직접 입력받도록 설정하였습니다.  
 check배열은 동전으로 만들 수 있는 합이 담길 배열입니다. (합이 0원, 합이 1원, 합이 2원 ... 합이 sum + 1)  
 0원을 만드는 방법은 아무 동전을 내지 않는 1가지 방법 뿐이므로 check[0] = 1이고  
 이중 반복문으로 체킹을 하게 된다면 check배열에는 0원 부터 sum+1의 수까지 동전으로 만들 수 있는 모든 경우의 수가 포함되게 됩니다.
