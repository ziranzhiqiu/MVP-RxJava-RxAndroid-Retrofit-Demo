逻辑并不复杂，我们先创建了一个BookPresenter 对象，

然后调用它的onCreate方法进行初始化，接着调用attachView来绑定BookView。

BookView的实现也很简单，在onSuccess方法中将Book 中内容显示在TextView上，在onError中弹出一个Toast提示。

然后点击按钮的时候就调用BookPresenter中getSearchBooks方法，同时传入必要的入参。

这样网络请求就开始了，如果请求成功就会回调BookView 中的onSuccess方法，失败就回调onError方法。

当活动销毁时记得调用BookPresenter的onStop方法来释放订阅关系，防止内存泄漏。

