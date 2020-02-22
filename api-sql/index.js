const expresss=require('express');
const mysql=require('mysql')

const app=express();
const port=3000;
app.listen(port,(req,res)=> {
    console.log(`servet running on port: ${port}`)
})