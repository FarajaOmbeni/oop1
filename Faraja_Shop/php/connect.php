<?php

    $servername = "localhost";
    $username = "root";
    $password = "kipese@!!!";
    $dbname = "faraja";


    $conn = mysqli_connect($servername,$username,$password,$dbname);

    if(!$conn){
        die("Connrction failed!".mysqli_connect_error());
    }
    echo "Connection Succesful";
?>