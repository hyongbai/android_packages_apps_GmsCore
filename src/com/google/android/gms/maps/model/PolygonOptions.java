/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PolygonOptions implements Parcelable {

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
	}

	public PolygonOptions() {
	}

	private PolygonOptions(Parcel in) {
	}

	public static Creator<PolygonOptions> CREATOR = new Creator<PolygonOptions>() {
		public PolygonOptions createFromParcel(Parcel source) {
			return new PolygonOptions(source);
		}

		public PolygonOptions[] newArray(int size) {
			return new PolygonOptions[size];
		}
	};
}
