# Instructions
* This is a IntelliJ project, developed with JDK 11 and JavaFX11 and must be run as such.
* To login as admin one must login as "000".
* To login as employee/project manager use initials (None added from start).

Debugging:
* Project structure
    * The src folder has to be marked as source folder in project structure.
    * The test folder has to be marked as such in project structure.
    * The resource folder has to be marked as such in project structure.
    * The out folder has to be the output folder.

* To run the application the VM options be set as follows:
  * --module-path javafx-sdk-11.0.2-win/lib --add-modules=javafx.controls,javafx.fxml
  * If you run another OS then:
    * --module-path [path_to_your_javafx] --add-modules=javafx.controls,javafx.fxml
   * The JavaFX library can be downloaded here: https://gluonhq.com/products/javafx/
