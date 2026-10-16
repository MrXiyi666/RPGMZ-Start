package fun.android.rpgmzstart.fun;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import fun.android.rpgmzstart.M;
import fun.android.rpgmzstart.R;

public class Fun {


    public static View getChildView(){
        View view = LayoutInflater.from(M.context).inflate(R.layout.item_view, M.linear, false);
        // 获取当前layout参数
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (lp == null) {
            lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, Fun.getHeight() / 10);
        } else {
            lp.height = Fun.getHeight() / 10;
        }
        view.setLayoutParams(lp);
        TextView name_view = view.findViewById(R.id.name_view);
        name_view.setText("列表");
        return view;
    }

    public static int getHeight(){
        // 获取屏幕高度
        DisplayMetrics dm = M.context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    public static int getWidth(){
        // 获取屏幕高度
        DisplayMetrics dm = M.context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }
}
