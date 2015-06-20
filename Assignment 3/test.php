<?php $str = file_get_contents("consumpro.json"); 
// Sending josn data as script to page as ajax reaponce
echo "<script>dataset=" .$str ."; </script>" ;
?>
