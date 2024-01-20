// Generated by view binder compiler. Do not edit!
package com.example.flatmatefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flatmatefinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView bio;

  @NonNull
  public final TextView branch;

  @NonNull
  public final EditText editBio;

  @NonNull
  public final ImageView editProfile;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView nameHeading;

  @NonNull
  public final ImageView profilePic;

  @NonNull
  public final TextView year;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView back,
      @NonNull TextView bio, @NonNull TextView branch, @NonNull EditText editBio,
      @NonNull ImageView editProfile, @NonNull TextView name, @NonNull TextView nameHeading,
      @NonNull ImageView profilePic, @NonNull TextView year) {
    this.rootView = rootView;
    this.back = back;
    this.bio = bio;
    this.branch = branch;
    this.editBio = editBio;
    this.editProfile = editProfile;
    this.name = name;
    this.nameHeading = nameHeading;
    this.profilePic = profilePic;
    this.year = year;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.bio;
      TextView bio = ViewBindings.findChildViewById(rootView, id);
      if (bio == null) {
        break missingId;
      }

      id = R.id.branch;
      TextView branch = ViewBindings.findChildViewById(rootView, id);
      if (branch == null) {
        break missingId;
      }

      id = R.id.editBio;
      EditText editBio = ViewBindings.findChildViewById(rootView, id);
      if (editBio == null) {
        break missingId;
      }

      id = R.id.editProfile;
      ImageView editProfile = ViewBindings.findChildViewById(rootView, id);
      if (editProfile == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nameHeading;
      TextView nameHeading = ViewBindings.findChildViewById(rootView, id);
      if (nameHeading == null) {
        break missingId;
      }

      id = R.id.profilePic;
      ImageView profilePic = ViewBindings.findChildViewById(rootView, id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.year;
      TextView year = ViewBindings.findChildViewById(rootView, id);
      if (year == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, back, bio, branch, editBio,
          editProfile, name, nameHeading, profilePic, year);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
