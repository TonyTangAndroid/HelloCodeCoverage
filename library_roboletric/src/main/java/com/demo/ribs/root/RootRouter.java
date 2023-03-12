package com.demo.ribs.root;

import com.uber.rib.core.ViewRouter;

public class RootRouter extends ViewRouter<RootView, RootInteractor> {

  RootRouter(RootView view, RootInteractor interactor) {
    super(view, interactor);
  }
}
