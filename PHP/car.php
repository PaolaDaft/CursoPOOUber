<?php

class Car{
    public $id;
    public $license;
    public $driver;
    public $passanger;

  public function __construct($license, $driver){
    $this->license = $license;
    $this->driver = $driver;
  }

  public function PrintDataCar(){
    echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
  }
}
?>