import java.util.*;

// 실행시키는 단축키 : ctrl + f11
// 글꼴 크기 변경 : ctrl + (+, -)
// 글자정렬 : ctrl + a -> ctrl + i
// 문장 복사 : ctrl + alt + 방향키
// 문장 위아래 이동 : alt + 방향키
// 전체주석 : ctrl + shift + /
// 전체주석풀기 : ctrl + shift + 달러표시
//int input = (new Scanner(System.in)).nextInt();

interface A{
	void func01();
	
	class B{
		void func02() {
			System.out.println("함수 2번 call");
		}
	}
}

class C implements A{

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		System.out.println("함수 1번 call");
	}
	
}

class D extends A.B{
	
}

public class Young {

	public static void main(String[] args) {

		D d = new D();
		d.func02();
	}
}
