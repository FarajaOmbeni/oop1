<?php 
require("connect.php");

$first_name = $_POST['first_name'];
$second_name = $_POST['second_name'];
$phone_number = $_POST['phone_number'];
$dob = $_POST['date_of_birth'];
$email = $_POST['email'];
$gender = $_POST['gender'];

/*echo $first_name;
echo $second_name;
echo $phone_number;
echo $dob;
echo $email;
echo $gender;*/


$sql = "INSERT INTO users(first_name, second_name, phone_number, dob, email, gender)  VALUES ('$first_name','$second_name','$phone_number','$dob','$email','$gender')";

if (mysqli_query($conn,$sql)) {
	echo "New Record inserted successfully";
}else{echo "Error: Record not added".mysqli_error($conn);}

?>