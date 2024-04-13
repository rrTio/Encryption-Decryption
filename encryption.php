<?php

// Function to encrypt the parameter
function encryptParameter($param)
{
    $key = "KEY"; // Change this to your secret key
    $method = "aes-256-cbc";
    $iv = openssl_random_pseudo_bytes(openssl_cipher_iv_length($method));
    $encrypted = openssl_encrypt($param, $method, $key, 0, $iv);
    
    return base64_encode($encrypted . '::' . $iv);
}

// Get the parameter from the GET request
$originalParam = isset($_GET['param']) ? $_GET['param'] : '';

// Encrypt the parameter
$encryptedParam = encryptParameter($originalParam);

$encdata->encryptionData = encryptedParam;
$encparamjson = json_encode($encdata);

echo "Encrypted Parameter: " . $encryptedParam;

?>