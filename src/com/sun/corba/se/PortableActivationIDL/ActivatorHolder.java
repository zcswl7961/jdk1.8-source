package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ActivatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u181/11358/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Saturday, July 7, 2018 4:03:11 AM PDT
*/

public final class ActivatorHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.Activator value = null;

  public ActivatorHolder ()
  {
  }

  public ActivatorHolder (com.sun.corba.se.PortableActivationIDL.Activator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ActivatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ActivatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ActivatorHelper.type ();
  }

}
