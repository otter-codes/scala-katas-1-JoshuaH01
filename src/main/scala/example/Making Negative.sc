/*
Easy	-	Making	Negative
Write	a	function	that	will	accept	an Int
and	make	it	negative.
But	remember,	it	might	already	be negative...

Examples

Passing	in	1	should	return	-1
Passing	in	0	should	return	0
Passing	in	-5	should	return	-5

Extension:
  Write	a	function	that	takes	a	list	of Ints
  and	makes	them	all	negative,	following	the	same	rules	as
  above.
  Remember	that	a	list	can	be	empty	*/


def MakingNegative(num: Int): Int = {

  if (num > 0) {
    -num
  } else {
    num
  }
}

MakingNegative(0)