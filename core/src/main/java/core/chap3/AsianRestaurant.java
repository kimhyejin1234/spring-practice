package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {

//객체(public AsianRestaurant ... )  생생 안할때는 아래와 같이 붙여도 가능하나 권장하지는 않는다.
//	@Autowired
//	@Qualifier("asianChef")
	 private Chef chef ;
	 
	//객체(public AsianRestaurant ... )  생생 안할때는 아래와 같이 붙여도 가능하나 권장하지는 않는다.
//		@Autowired
//		@Qualifier("sushi")
	 //요리 코스
	 private Course course ;
	 
	 @Autowired
	 public AsianRestaurant(@Qualifier("asianChef")Chef chef,@Qualifier("sushi")Course course) {
		super();
		this.chef = chef;
		this.course = course;
	 } 
	 
	 //요리를 주문하는 기능
	 public void order() {
		 System.out.println("Asian 요리를 주문합니다.");
		 course.combineMenu();
		 chef.cook();
	 }

}
