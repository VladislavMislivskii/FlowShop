import React from 'react';
import Btn_primary from './components/Btn_primary';
import Btn_secondary from './components/Btn_secondary';
import Checkbox from './components/Checkbox';
import Link from './components/Link';
import Radiobutton from './components/Radiobutton';


function App() {
  return (
    <div className="App">
      <h1>Кнопки</h1>
      <div className='buttons' style={{display: 'inline-block', width: '100%'}}>
        <Btn_primary value={"Кнопка"}/>
        <Btn_secondary value={"Кнопка"}/>
      </div> 
      <h1>Иконки</h1>
      <div className='icons'>
          
      </div>
      <h1>Ссылка</h1>
      <div className='link'>
        <Link value={"Ссылка"}/>
      </div>
      <h1>Чекбокс</h1>
      <div className='checkbox'>
        <Checkbox/>
      </div>
      <h1>Радиокнопка</h1>
      <div className='radiobutton'>
        <Radiobutton/>
      </div>
    </div>
  );
}

export default App;
