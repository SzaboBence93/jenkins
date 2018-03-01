// Script //
node {
/* .. snip .. */
stage('Test') {
/* `make check` returns non-zero on test failures,
* using `true` to allow the Pipeline to continue nonetheless
*/
sh 'make check || true'
junit '**/target/*.xml'
}
/* .. snip .. */
}