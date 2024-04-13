<?php
function decryptParameter($encryptedParam)
{
    $key = "KEY"; // Same key used for encryption
    $method = "aes-256-cbc";

    // Split the encrypted string into encrypted data and IV
    list($encryptedData, $iv) = explode('::', base64_decode($encryptedParam), 2);

    // Decrypt the parameter
    $decryptedParam = openssl_decrypt($encryptedData, $method, $key, 0, $iv);

    return $decryptedParam;
}

// Get the encrypted parameter from the GET request
$encryptedParam = isset($_GET['param']) ? $_GET['param'] : '';

// Decrypt the parameter
$decryptedParam = decryptParameter($encryptedParam);

// Output the decrypted parameter
echo "Decrypted Parameter: " . $decryptedParam;
?>