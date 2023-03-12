package org.neotech.app.multimoduleapplication;

import android.widget.FrameLayout;
import androidx.test.core.app.ApplicationProvider;
import com.demo.ribs.root.RootRouter;
import com.demo.ribs.root.RootScope;
import motif.ScopeFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class RootScopeExtraTest {

  @Test
  public void whenViewAttached_shouldFindText() {
    RootRouter rootRouter = scope().rootRouter();
    rootRouter.dispatchAttach(null);
  }

  private static RootScope scope() {
    return ScopeFactory.create(RootScope.class, RootScopeExtraTest::parentViewGroup);
  }

  private static FrameLayout parentViewGroup() {
    return new FrameLayout(ApplicationProvider.getApplicationContext());
  }
}
