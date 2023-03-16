<?php
require_once('car.php')
class UbarBlack extends Car{
    public $typeCarAccepted;
    public $seatMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatMaterial = $seatMaterial;
    }

}
?>