import React from 'react';
import Icon_bag from './components/Icon_bag';
import Icon_cart from './components/Icon_bag';
import Icon_delete from './components/Icon_delete';
import Link from './components/Link';
import './styles/kit_style.css'
import './styles/btn_primary.css'
import './styles/btn_secondary.css'
import './styles/checkbox.css'
import './styles/radiobutton.css'
import './styles/inputs.css'

function App() {
  return (
    <div className="App">
      <h1>UI kit</h1>

      <h2>Кнопки</h2>
      <div className='buttons'>
          Primary:
          <button class="btn-primary" href='#'>Кнопка</button>
          Primary disabled:
          <button class="btn-primary" href='#' disabled>Кнопка</button>
        </div>
        <div className='buttons'>
          Secondary:
          <button class = "btn-secondary">Кнопка</button>
          Secondary disabled:
          <button class = "btn-secondary" disabled>Кнопка</button>
        </div>

      <h2>Иконки</h2>
      <div className='icons'>
          <div style={{float: 'left'}}>Иконка 1:</div>
          <Icon_bag/>
          <div style={{float: 'left'}}>Иконка 2:</div>
          <Icon_delete/>
      </div><br/>

      <h2>Ссылка</h2>
      <Link value={"Ссылка"}/>

      <h2>Чекбокс</h2>
      <div className='checkbox'>
      <input class="custom-checkbox" type="checkbox" id="color-1" name="color-1" value="indigo"/><label for="color-1">Active</label>
      <input class="custom-checkbox" type="checkbox" id="color-2" name="color-1" value="indigo"/><label for="color-2">Active</label>
      <input class="custom-checkbox" type="checkbox" id="color-3" name="color-1" value="indigo" disabled/><label for="color-3">Disabled</label>
      <input class="custom-checkbox" type="checkbox" id="color-4" name="color-1" value="indigo"/><label for="color-4">Active</label>
      </div>

      <h2>Радиокнопка</h2>
      <div className='radiobutton'>
      <input class="custom-radio" type="radio" id="color-5" name="color" value="indigo1" /><label for="color-5">Active </label>
      <input class="custom-radio" type="radio" id="color-6" name="color" value="indigo1" disabled/><label for="color-6">Disabled</label>
      <input class="custom-radio" type="radio" id="color-7" name="color" value="indigo1" /><label for="color-7">Active</label>

      <h2>Поля ввода</h2>
      <div class="lines">
        <div class="line">
          <div style={{float: 'left'}}>Input normal:</div> <div class="div-text-normal"><input class="text-normal" placeholder="Text" type="text"/></div>
          <div style={{float: 'left'}}>Disabled:</div> <div class="div-text-normal disabled"><input class="text-normal" placeholder="Text" type="text" disabled/></div>
          <div style={{float: 'left'}}>Error:</div> <div class="div-text-normal error"><input class="text-normal" placeholder="Text" type="text"/></div>
        </div>
      </div>
      
      
      </div>
    </div>
  );
}

export default App;
