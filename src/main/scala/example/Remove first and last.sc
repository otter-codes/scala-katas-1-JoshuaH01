/*
Easy	-	Remove	First	and	Last
  Write	a	function	that	takes	a
  String
and	removes	the	first	and	last	characters	from	it.
  Return	an
  empty
string	if	the	input	string	has	2	or	fewer	characters.
Examples
Passing	in	"hello"	will	return	"ell"
Passing	in	"hi"	will	return	*/



def RemoveFL(Input:String): String = {
   Input.tail.init

}

RemoveFL("Hello")
RemoveFL("Hi")