//February 05, 2023 Homework2 Solutions: 
/*1.	Create a String variable and find the sum of the ASCII values of the second 
and the last characters of the String different then space.
==> charAt(), length(), 1, ==> trim(), */
string str = '  Fenerbahce  ';
integer asciiValueOf2 = str.trim().charAt(1); //second character
integer asciiValueOfLast = str.trim().charAt(str.trim().length()-1); //lastCharacter
System.debug(asciiValueOf2+asciiValueOfLast);//202
//
string quote ='If you can dream it, you can do it.';
Integer lastIndex = quote.trim().length()-1; 
integer asciiOfQuote = quote.trim().charAt(1)+quote.charAt(lastIndex);
system.debug(asciiOfQuote); //148
​
/*
2.	Type code to check if a String has any space character at the beginning and at the end? 
For example: For ‘Apex  code should print false n the console 
For ‘Apex’ your code should print true on the console
==> equals(), trim(), startWith(), EndsWith(), */
//Way1: 
string word = ' Word ';
boolean isThereSpace = word.startsWith(' ')&& word.endsWith(' ');
system.debug('If I say there is space that is '+isThereSpace );
​
//Way2: 
String str = ' I enyoy Apex ';
String trmmedStr = str.trim(); 
Boolean isBothEquals = str.equals(trmmedStr); 
System.debug('Is str and trimmed str same? '+isBothEquals); //Is str and trimmed str same? false
//Way3:
System.debug(str.right(2).equals(' ')&&str.left(1).equals(' ')); //true 
//Right(), and Left() methods taking length as a parameter. 
​
/*
3.	Write a code to check if a string has a single space at the middle. 
Example ‘I love Apex’ ==> your code should print false 
‘   Apex Java   ‘ ==> your code should print true. 
==> trim(), deleteWhiteSpace(), length(), containsAny(), countMatches()
*/
//Way1:
String str = ' Apex Calis ';
Boolean isThereSpaceInMiddle = str.trim().ContainsAny(' ');
System.debug(isThereSpaceInMiddle); //True 
//Way2: 
string singleSpaceCheck = 'I love drinking tea';
integer countSpace = singleSpaceCheck.trim().countMatches(' ');
boolean isThereOneSpace = countSpace==1;
system.debug(isThereOneSpace);// false
//Way3:
String str = ' APex is easy Language'; 
String trimmedStr = str.trim(); 
String noSpaceInstr = trimmedStr.deleteWhiteSpace(); 
Boolean isThereOnlyOneSpace = trimmedStr.length()-noSpaceInstr.length() ==1;
system.debug(isThereOnlyOneSpace); 
​
/*
4.	Write code to check if a String has an uppercase initial and lowercase at the end.
Example: For ‘I love apex’ your code should print true on the console
For ‘APEX’ your code should print false on the console
*//WWay1: 
String str = 'ApEX';
Boolean firstChar = str.charAt(0)>64 && str.charAt(0)<91; //UpperCase 65==A 90==Z ==> True\False
Boolean lastChar = str.charAt(str.length()-1)>96 && str.charAt(str.length()-1)<123; //a-z ==> True/False
System.debug(firstChar && lastChar);
//Way2:
String str = 'Apex'; 
System.debug(str.left(1).isAllUpperCase() && str.right(1).isAllLowerCase()); 
​
/*
5.	Type code to check if a password is valid or not for the following conditions;
o	Password must have at least 12 characters different from space character
o	Password must have at least 1 symbol
o	Password must have at least 1 uppercase
o	Password must have at least 1 number 
o	Password must have at least 1 lower case
​
*/
string  s1 = '*44England23*/@';
boolean length = s1.length()>=12;
boolean simbol = s1.replaceAll('[A-Za-z0-9]','').length()>0; //remove everything other symbols then check if the
//length is still greater than 0 or not. 
boolean upper = s1.replaceAll('[^A-Z]','').length()>0;//Remove evertyhing other than A-Z
boolean num = s1.replaceAll('[^0-9]','').length()>0;
boolean lower = s1.replaceAll('[^a-z]','').length()>0;
system.debug(length && simbol && upper && num && lower); //True
​
/*
6.	Write code that finds out how many days you lived. 
*/
Date myBd= Date.newInstance(1999, 05, 13);  
Date cyrrentDay = date.today();
integer daysBetween = myBd.daysBetween(cyrrentDay);
System.debug(daysBetween);
​
/*
7.	 Write  code that finds out how many months you lived. 
*/
date myBirthDate = date.newInstance(1986, 10, 28);
integer numOfMonths = myBirthDate.monthsBetween(date.today());
System.debug(numOfMonths);//436
​
/*
8.	Date of birth of your friend is  5th of September 1986. 
Type code to find the exact date 3 years, 5 months, and 15 days after your friend’s birth date.
*/
Date friendBrtDate = date.newInstance(1986, 02, 05);
Date futureDate = friendBrtDate.addYears(3).addMonths(5).addDays(24);
Date futureDate2 = friendBrtDate.addDays(24).addMonths(5).addYears(3);
System.debug(futureDate);
System.debug(futureDate2);
​
/*
9. Mehmet was born 30 years, 12 months and 5 days after 29 October 1960. 
Noah was born 31 years, 4 months and 11 days before 16 September 2022. 
Type code to calculate the exact date of birth of  Mehmet and Noah. 
Type code to check if the date of birth of Mehmet and Noah is the same or not.
​
*/
Date mehmetDob = Date.newInstance(1960,10,29).addYears(30).addMonths(12).addDays(5);
system.debug(mehmetDob);//1991-11-03 00:00:00
Date noahDob = Date.newInstance(2022,09,16).addYears(-31).addMonths(-4).addDays(-11);
system.debug(noahDob);//1991-05-05 00:00:00
boolean isSame = mehmetDob.isSameDay(noahDob);
system.debug(isSame);//false
system.assertEquals(mehmetDob, noahDob); 
//System.AssertException: Assertion Failed: Expected: 1991-11-03 00:00:00, Actual: 1991-05-05 00:00:00
//We will use that methods in test classes mostly to check expected output from our codes,
//and actual outpust produced by codes. 
​
/*
10.	Noah was born 5  years and 11 days after Adem.
Noah gave you his date of birth as String in the local date format.
Type code to calculate Adem’s date of birth.
*/
String stringDate = '06/04/2014'; 
Date dateOfBirt = Date.parse(stringDate); 
Date dOAdem = dateOfBirt.addYears(-5).addDays(-11); 
System.debug(dOAdem); //2009-05-24 00:00:00
​
​
​
​
​
​
​