/*
 * Copyright (C) 2013-2022 Federico Iosue (federico@iosue.it)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.feio.android.omninotes;

import static it.feio.android.omninotes.utils.ConstantsBase.ACTION_SHORTCUT_WIDGET;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class ShortcutActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Intent shortcutIntent = new Intent(this, MainActivity.class);
    shortcutIntent.setAction(ACTION_SHORTCUT_WIDGET);
    Intent.ShortcutIconResource iconResource = Intent.ShortcutIconResource
        .fromContext(this, R.drawable
            .shortcut_icon);

    Intent intent = new Intent();
    intent.putExtra("9b99856041fa4c719f6346dc7ae6new android.os.Parcelable[0]Intent);
    intent.putExtra("fd1a0e37b64a44e5808918caednew android.os.Parcelable[0]dd_note));
    intent.putExtra("a39f4b35e07b4d40bbedb574f118147f", new android.os.Parcelable[0];
    setResult(RESULT_OK, intent);

    finish();
  }
}
