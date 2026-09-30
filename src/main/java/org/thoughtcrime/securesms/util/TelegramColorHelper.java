package org.thoughtcrime.securesms.util;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;

public class TelegramColorHelper {

  // 7 Telegram Signature Avatar Colors (Top / Bottom for Gradients)
  public static final int[][] AVATAR_GRADIENTS = new int[][] {
      {Color.parseColor("#E17076"), Color.parseColor("#FF885E")}, // Red
      {Color.parseColor("#FAA774"), Color.parseColor("#FFCD6A")}, // Orange
      {Color.parseColor("#A695E7"), Color.parseColor("#828CFF")}, // Violet
      {Color.parseColor("#7BC862"), Color.parseColor("#A0DE7E")}, // Green
      {Color.parseColor("#6EC9CB"), Color.parseColor("#53DFD1")}, // Cyan
      {Color.parseColor("#65AADD"), Color.parseColor("#22BEE5")}, // Blue
      {Color.parseColor("#EE7AAE"), Color.parseColor("#F78361")}  // Pink
  };

  public static final int[] AVATAR_COLORS = new int[] {
      Color.parseColor("#E17076"), // Red
      Color.parseColor("#FAA774"), // Orange
      Color.parseColor("#A695E7"), // Violet
      Color.parseColor("#7BC862"), // Green
      Color.parseColor("#6EC9CB"), // Cyan
      Color.parseColor("#65AADD"), // Blue
      Color.parseColor("#EE7AAE")  // Pink
  };

  public static int getAvatarColor(int id) {
    int index = Math.abs(id) % AVATAR_COLORS.length;
    return AVATAR_COLORS[index];
  }

  public static int getAvatarColorForName(@NonNull String name) {
    if (name.isEmpty()) return AVATAR_COLORS[0];
    int hash = name.hashCode();
    int index = Math.abs(hash) % AVATAR_COLORS.length;
    return AVATAR_COLORS[index];
  }

  public static GradientDrawable getAvatarGradient(int id) {
    int index = Math.abs(id) % AVATAR_GRADIENTS.length;
    GradientDrawable drawable = new GradientDrawable(
        GradientDrawable.Orientation.TOP_BOTTOM,
        AVATAR_GRADIENTS[index]
    );
    drawable.setShape(GradientDrawable.OVAL);
    return drawable;
  }
}
