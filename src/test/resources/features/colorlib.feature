@stories

  Feature: Reto101
  como usuario, quiero verficar el funcionamiento de la pagina colorlib

  Background:
  Given que Laura quiere ingresar a la pagina colorlib
  When busque el formulario en el menú y seleccione la opcion Validación de formulario

  @scenario1
  Scenario:  verificar el funcionamiento de la opcion Block Validation
  Then validacion del formulacion Block Validation

  @scenario2
  Scenario: verificar el funcionamiento de la opcion Inline Validation
  Then validacion del formulario Inline Validation

    @scenario3
    Scenario: Valores incorrectos en el formulario Block Validation
      Then Los valores del formulario Block Validation son incorrectos



