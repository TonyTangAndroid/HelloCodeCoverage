package com.demo.ribs.root;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.demo.lib1.R;
import com.demo.ribs.root.RootScope.Dependencies;
import motif.Creatable;

@motif.Scope
public interface RootScope extends Creatable<Dependencies> {

  RootRouter rootRouter();

  @motif.Objects
  abstract class Objects implements RootObjects {

    RootView rootView(ViewGroup parentViewGroup) {
      return (RootView)
          LayoutInflater.from(parentViewGroup.getContext())
              .inflate(R.layout.root_view, parentViewGroup, false);
    }
  }

  interface RootObjects {

    RootRouter rootRouter();

    RootInteractor rootInteractor();

    RootInteractor.RootPresenter rootPresenter(RootView impl);
  }

  interface Dependencies {

    ViewGroup parentViewGroup();
  }
}
