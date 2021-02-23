package cordova.plugin.heartlandbluetooth;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.math.BigDecimal;   
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.heartlandpaymentsystems.library.CardFragment;
import com.heartlandpaymentsystems.library.entities.Card;         
import com.heartlandpaymentsystems.library.terminals.ConnectionConfig;
import com.heartlandpaymentsystems.library.terminals.DeviceListener; 
import com.heartlandpaymentsystems.library.terminals.entities.TerminalResponse; 
import com.heartlandpaymentsystems.library.terminals.TransactionListener;         
import com.heartlandpaymentsystems.library.terminals.c2x.BaseBuilder;         
import com.heartlandpaymentsystems.library.terminals.c2x.C2XDevice;         
import com.heartlandpaymentsystems.library.terminals.c2x.CreditAuthBuilder;         
import com.heartlandpaymentsystems.library.terminals.entities.CardholderInteractionRequest;         
import com.heartlandpaymentsystems.library.terminals.enums.Environment;         
import com.heartlandpaymentsystems.library.terminals.enums.TransactionStatus;
import com.heartlandpaymentsystems.library.entities.Card;
import com.heartlandpaymentsystems.library.entities.Token;
import com.heartlandpaymentsystems.library.controller.TokenService;

/**
 * This class echoes a string called from JavaScript.
 */
public class HeartlandBluetooth extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException 
    {
        if(action.equals("add"))
        {
            this.add(args, callbackContext);
            return true;
        } else if (action.equals("substract")) {
            this.substract(args, callbackContext);
            return true;  
        } else if(action.equals("deviceConfig")){
            this.deviceConfig(args, callbackContext);
            return true;  
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try{
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt( args.getJSONObject(0).getString("param2"));
                callback.success("" + (p1 + p2));
            }catch(Exception ex) {
                callback.error("something went wrong" + ex);
            }
        } else {
            callback.error("plz dont pass null values");
        }
    }

        private void substract(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try{
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt( args.getJSONObject(0).getString("param2"));
                callback.success("" + (p1 - p2));
            }catch(Exception ex) {
                callback.error("something went wrong" + ex);
            }
        } else {
            callback.error("plz dont pass null values");
        }
    }



    private void deviceConfig(JSONArray args, CallbackContext callback) {
        if(args != null) {
            try{
                ConnectionConfig connectionConfig = new ConnectionConfig();
                connectionConfig.setUsername("777700004597");
                connectionConfig.setPassword("$Test1234");
                connectionConfig.setSiteId("20904");
                connectionConfig.setDeviceId("1520053");
                connectionConfig.setLicenseId("20903");
                connectionConfig.setEnvironment(Environment.TEST);
                callback.success("hi this is connection config");
            }catch(Exception ex) {
                callback.error("something went wrong" + ex);
            }
        } else {
            callback.error("plz dont pass null values");
        }
    }
}
