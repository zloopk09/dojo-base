package top.zloop.mobile.dojo.module.base;

public interface IModule {

    boolean init();

    void onModuleInstalled();
    void onModuleUninstalled();

}
