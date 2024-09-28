selenium
import org.openga.selenium.By;
import org.openga.selenium.By xpath;
import org.openga.selenium.webdriver;
import org.openga.selenium.edge.EdgeDriver;
import io.github.bonigarcia.webmanager;
public class classone {
public static void main (string[ ]args)
{
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("       ");
driver.findelement(By. id("      ")).click();  
driver.findelement(By. classname("      ")); 
driver.findelement(By. xpath("      "));
driver.close();
system.out.println["process...."]
}
} 
===================================================
#!/bin/bash

VAR_1="Devil"
VAR_2="OWL"

echo "$VAR_1$VAR_2"
...........................................................................................
#!/bin/bash

var1="Devil"
var2=23
echo $var1 $var2

unset var1

echo $var1 $var2
..............................................................................................

#!/bin/bash
var1="Devil"
var2=23
readonly var1
echo $var1 $var2
var1=23
echo $var1 $var2
................................................................................................
# accessing the declared variables using $
echo "Name is $Var_name, and age is $Var_age."

# read-only variables
var_blood_group="O-"
readonly var_blood_group
echo "Blood group is $var_blood_group and read only."
echo "Error for read only variables, if trying to \
modify them."
echo
var_blood_group="B+"
echo

# unsetting variables
unset Var_age
echo "After unsetting var_age..."
echo
echo "Name is $Var_name, blood group is $var_blood_group\
 and age is $Var_age..."
.................................................................................................................
Implementation of `While` Loop in Shell Script.

vim looping.sh
chmod +x looping.sh  (./looping.sh)

====================================
#/bin/bash

a=0

# lt is less than operator

#Iterate the loop until a less than 10

while [ $a -lt 10 ]
do
# Print the values
echo $a
# increment the value
a=`expr $a + 1`
done


=============================

#/bin/bash

a=0

# -gt is greater than operator
#Iterate the loop until a is greater than 10

until [ $a -gt 10 ]
do

# Print the values
echo $a

# increment the value
a=`expr $a + 1`
done

==================
Implementation of `for` Loop with `break` statement in Shell Script.

#/bin/bash

#Start of for loop

for a in 1 2 3 4 5 6 7 8 9 10
do

# if a is equal to 5 break the loop
if [ $a == 5 ]
then
break
fi

# Print the value
echo “Iteration no $a”
done

==================

Implementation of `for` Loop with `continue` statement in Shell Script.

#/bin/bash

for a in 1 2 3 4 5 6 7 8 9 10
do

# if a = 5 then continue the loop and
# don’t move to line 8

if [ $a == 5 ]
then
continue
fi
echo “Iteration no $a”
done


====================
Implementing `until` Loop in Shell Script

#/bin/bash

a=0

# -gt is greater than operator
#Iterate the loop until a is greater than 10

until [ $a -gt 10 ]
do


=======================
Creating an Infinite Loop with “while true” in Shell Script

#/bin/bash

while true
do

# Command to be executed
# sleep 1 indicates it sleeps for 1 sec
echo “Hi, I am infinity loop”
sleep 1
done
======================================
# ==
if [ 'Girish' == 'Girish' ];
then
    echo "same" #output
else
    echo "not same"
fi

# !=
if [ 'Girish' != 'Apple' ];
then
    echo "not same" #output
else
    echo "same"
fi

# -n
if [ -n "Girish" ];
then
    echo "not null" #output
else
    echo "null"
fi

# -z
if [ -z "Girish" ];
then
    echo "null"
else
    echo "not null" #output
fi


==========================

# -eq
if [ 10 -eq 10 ];then
echo "Equal"
fi

# -ge
if [ 10 -ge 9 ];then
echo "Greater or equal"
fi

# -gt
if [ 10 -gt 8 ];then
echo "Greater"
fi

# -le
if [ 10 -le 12 ];then
echo "Less than or equal"
fi

# -lt
if [ 10 -lt 13 ];then
echo "Less than"
fi

# -ne
if [ 10 -ne 13 ];then
echo "Not Equal"
fi
======================================
if-fi

Name="Girish"
if [ "$Name" = "Girish" ]; then
  echo "His name is Girish. It is true."
fi

====================
if-else-fi
====================
Age=17
if [ "$Age" -ge 18 ]; then
    echo "You can vote"
else
    echo "You cannot vote"    
fi

====================
if-elif-else-fi
====================

Age=17
if [ "$Age" -ge 18 ]; then
    echo "You can vote"
elif [ "$Age" -eq 17 ]; then
    echo "You can vote after one year"
else
    echo "You cannot vote"    
fi

====================
Nested if-else
====================

echo "Enter subject"
read subject

if [ $subject == 'Linux' ]
then
echo "Enter Marks"
read marks
        if [ $marks -ge 30 ]
        then
        echo "You passed"
        else
        echo "You failed"
        fi
else
echo "Wrong Subject"
fi
