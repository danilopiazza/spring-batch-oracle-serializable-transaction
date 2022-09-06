# https://github.com/oracle/docker-images/blob/master/OracleDatabase/SingleInstance/FAQ.md#ora-12637-packet-receive-failed
if ! grep -q DISABLE_OOB $ORACLE_BASE_HOME/network/admin/sqlnet.ora; then
  echo "Disabling out-of-band break messages (DISABLE_OOB) in sqlnet.ora"
  echo 'DISABLE_OOB = ON' >> $ORACLE_BASE_HOME/network/admin/sqlnet.ora
fi
