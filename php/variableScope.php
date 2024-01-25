<?php

$x = 5; 

function func00() {
	echo "Variable x is: $x\n";
} func00(); // Error

function func01() {
	global $x; 
	echo "Variable x is: $x\n";
} func01(); // 5

function func02() { 
	echo "Variable x is: " . $GLOBALS['x'] . "\n";
} func02(); // 5

function func03() {
	$x = 0; 
	echo $x . " " ; 
	$x++;  
} func03(); func03(); func03(); // 0 0 0 

function func04() {
	static $x = 0; 
	echo $x . " ";
	$x++; 
} func04(); func04(); func04(); // 0 1 2
?>
