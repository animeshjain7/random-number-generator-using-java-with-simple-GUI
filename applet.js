var attributes = {
    code: 'RNwithGUI.class',
    width: 300,
    height: 200
  };
  
  var parameters = {
    archive: 'RNwithGUI.jar',
    codebase: '.'
  };
  
  var version = '1.8';
  
  deployJava.runApplet(attributes, parameters, version);
  