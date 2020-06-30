package org.acgnrocn.lib.baserqnp;


import org.acgnrocn.lib.baseobj.BaseDomain;
import org.acgnrocn.lib.baseobj.IPojo;

import java.io.Serializable;

/**
 * 统一web端请求基础类
 * 只做web端请求
 */
public abstract class AbstractRequest extends BaseDomain implements IMicroRequestable, Serializable, IPojo {

}
