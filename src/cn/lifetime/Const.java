package cn.lifetime;

import java.awt.*;

/**
 * @author Lifetime Max
 * @date 2024/01/24 0024 16:07
 * @description Const
 */
public class Const {
    public static final int FRAME_H = 400;
    public static final int FRAME_W = 300;
    public static final int SCREEN_W = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static final int SCREEN_H = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static final int CURRENT_H = (SCREEN_H-FRAME_H)/2;
    public static final int CURRENT_W = (SCREEN_W - FRAME_W)/2;
}
