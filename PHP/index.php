<?php
echo "Hello, world!\n";

require_once('car.php');
require_once('account.php');
require_once('UberX.php');
require_once('UberPool.php');

$uberX = new UberX("PD15", new Account("José Ubaldo", "JOUB16"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("DAFT25", new Account("Paola Josefa", "PAJO15"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>
