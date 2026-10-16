package fun.android.rpgmzstart;

import android.app.Application;
import android.util.Log;
import java.io.File;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        File file = getExternalFilesDir(null);
        if (file != null && file.exists()) {
            File[] children = file.listFiles();
            assert children != null;
            for (File f : children) {
                String name = f.getName();
                if(f.isDirectory()){

                    M.file_list.add(name);
                }
            }
        }

        for(String name : M.file_list){
            Log.w("file_list", name);
        }
    }
}
