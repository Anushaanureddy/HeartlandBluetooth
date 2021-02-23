var exec = require('cordova/exec');

module.exports.add = function(arg0, success, error) {
    exec(success, error, 'HeartlandBluetooth', 'add', [arg0]);
}

module.exports.substract = function(arg0, success, error) {
    exec(success, error, 'HeartlandBluetooth', 'substract', [arg0]);
}