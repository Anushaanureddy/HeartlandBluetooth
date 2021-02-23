var exec = require('cordova/exec');

// module.exports.coolMethod = function(arg0, success, error) {
//     exec(success, error, 'HeartlandBluetooth', 'coolMethod', [arg0]);
// };

module.exports.add = function(args0, success, error) {
    exec(success, error, 'HeartlandBluetooth', 'add', [arg0]);
}

module.exports.substract = function(args0, success, error) {
    exec(success, error, 'HeartlandBluetooth', 'substract', [arg0]);
}