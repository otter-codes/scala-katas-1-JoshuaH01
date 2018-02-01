println("hello")

/*
Easy	-	Count	Odds
  Write	a	function	that	takes	in	an
Int
and	returns	the	number	of	positive	odd	numbers	below	that.
Examples
Given	8,	return	4	(i.e.	1,	3,	5,	7)
Given	7,	reutrn	3	(i.e*/

def isOdd(number: Int): List[Int] = {

  val list: List[Int] = List.range(1, number)

  list.filter(x => x % 2 == 1)
}

  isOdd(7)
