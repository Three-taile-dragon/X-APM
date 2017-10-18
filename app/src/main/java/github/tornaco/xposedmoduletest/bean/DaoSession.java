package github.tornaco.xposedmoduletest.bean;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import github.tornaco.xposedmoduletest.bean.PackageInfo;

import github.tornaco.xposedmoduletest.bean.PackageInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig packageInfoDaoConfig;

    private final PackageInfoDao packageInfoDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        packageInfoDaoConfig = daoConfigMap.get(PackageInfoDao.class).clone();
        packageInfoDaoConfig.initIdentityScope(type);

        packageInfoDao = new PackageInfoDao(packageInfoDaoConfig, this);

        registerDao(PackageInfo.class, packageInfoDao);
    }
    
    public void clear() {
        packageInfoDaoConfig.getIdentityScope().clear();
    }

    public PackageInfoDao getPackageInfoDao() {
        return packageInfoDao;
    }

}
